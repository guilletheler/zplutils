package com.gt.zplutils;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.gt.zplutils.zpl.support.ZplUtils;

/**
 * Test char convertion
 * 
 * @author Venkaiah Chowdary Koneru
 * 
 */
public class ZplAccentTest {

    /**
     * Test with many instructions (based on real case)
     * 
     * @throws IOException
     */
    @Test
    public void testZebraLibrary1() throws IOException {
	assertEquals("Qt\\82", ZplUtils.convertAccentToZplAsciiHexa("Qté"));
	assertEquals("\\85", ZplUtils.convertAccentToZplAsciiHexa("à"));

    }
}
