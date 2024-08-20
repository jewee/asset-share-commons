/*
 * Asset Share Commons
 *
 * Copyright (C) 2024 Adobe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.adobe.aem.commons.assetshare.util.impl.responses;

import org.apache.sling.api.SlingHttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.WriteListener;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class DiscardingResponseWrapperTest {

    private SlingHttpServletResponse response;
    private DiscardingResponseWrapper discardingResponseWrapper;

    @BeforeEach
    public void setup() {
        response = mock(SlingHttpServletResponse.class);
        discardingResponseWrapper = new DiscardingResponseWrapper(response);
    }

    @Test
    public void testGetOutputStream() throws IOException {
        ServletOutputStream outputStream = discardingResponseWrapper.getOutputStream();
        assertNotNull(outputStream);
        assertTrue(outputStream.isReady());

        outputStream.setWriteListener(mock(WriteListener.class));
        outputStream.write(1);
    }

    @Test
    public void testGetWriter() throws IOException {
        PrintWriter writer = discardingResponseWrapper.getWriter();
        assertNotNull(writer);

        writer.write(1);
        writer.write(new char[]{'a', 'b', 'c'}, 1, 2);
        writer.write("test", 1, 2);
        writer.flush();
        writer.close();
    }
}