/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package android.compat.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import libcore.api.CorePlatformApi;
import libcore.api.IntraCoreApi;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Used to indicate that a compatibility {@link ChangeId change} is enabled only for apps with a
 * {@code targetSdkVersion} of <em>greater than</em> the given value.
 *
 * <p>This annotation should only be applied to change ID constants that are also annotated with
 * {@link ChangeId}. In any other context, this annotation will have no effect.
 *
 * @hide
 */
@Retention(CLASS)
@Target({FIELD})
@CorePlatformApi
@IntraCoreApi
public @interface EnabledAfter {
  /**
   * @return The maximum {@code targetSdkVersion} for which this change does not apply. Apps with
   *     a {@code targetSdkVersion} of greater than this value will get the change.
   */
  @CorePlatformApi
  @IntraCoreApi
  int targetSdkVersion();
}
