/*
 * Copyright 2000-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.openapi.util.io;

import com.intellij.openapi.util.SystemInfo;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assume.assumeTrue;

public class FileAttributesNio2ReadingTest extends FileAttributesReadingTest {
  @BeforeClass
  public static void setUpClass() throws Exception {
    System.setProperty(FileSystemUtil.FORCE_USE_NIO2_KEY, "true");
    FileSystemUtil.resetMediator();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    System.setProperty(FileSystemUtil.FORCE_USE_NIO2_KEY, "");
    FileSystemUtil.resetMediator();
  }

  @Override
  @Before
  public void setUp() throws Exception {
    assumeTrue(SystemInfo.isJavaVersionAtLeast("1.7"));
    super.setUp();
  }
}
