/*
 * Copyright © 2016, Finium Sdn Bhd, All Rights Reserved
 * 
 * ZebraNativeZpl.java
 * Modification History
 * *************************************************************
 * Date			Author		Comment
 * Jan 26, 2016		Venkaiah Chowdary Koneru		Created
 * *************************************************************
 */
package com.gt.zplutils.model.element;

import com.gt.zplutils.model.ZebraElement;

/**
 * Object use if you want add Zpl Code not supported by this library
 * 
 * @author Venkaiah Chowdary Koneru
 * 
 */
public class ZebraNativeZpl extends ZebraElement {

    private String zplCode;

    /**
     * 
     * @param zplCode
     */
    public ZebraNativeZpl(String zplCode) {
	super();
	this.zplCode = zplCode;
	this.defaultDrawGraphic = false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getZplCode() {
	return zplCode;
    }
}
