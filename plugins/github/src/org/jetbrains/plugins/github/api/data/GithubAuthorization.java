/*
 * Copyright 2000-2016 JetBrains s.r.o.
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
package org.jetbrains.plugins.github.api.data;

import com.intellij.tasks.impl.gson.Mandatory;
import com.intellij.tasks.impl.gson.RestModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@RestModel
@SuppressWarnings("UnusedDeclaration")
public class GithubAuthorization {
  @Mandatory private Long id;
  private String url;
  @Mandatory private String token;
  private String note;
  private String noteUrl;
  @Mandatory private List<String> scopes;

  @NotNull
  public String getToken() {
    return token;
  }

  @NotNull
  public List<String> getScopes() {
    return scopes;
  }

  @Nullable
  public String getNote() {
    return note;
  }

  public long getId() {
    return id;
  }
}
