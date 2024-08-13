package com.adobe.aem.commons.assetshare.content.renditions.download.impl;

import com.adobe.aem.commons.assetshare.content.renditions.download.AssetRenditionsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssetRenditionsExceptionTest {
    @Test
    public void getMessage() {
        AssetRenditionsException exception = new AssetRenditionsException("Hello Error");
        assertEquals("Hello Error", exception.getMessage());
    }
}