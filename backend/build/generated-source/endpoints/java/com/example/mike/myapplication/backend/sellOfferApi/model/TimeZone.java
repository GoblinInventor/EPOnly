/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-08-03 17:34:38 UTC)
 * on 2015-11-04 at 00:41:48 UTC 
 * Modify at your own risk.
 */

package com.example.mike.myapplication.backend.sellOfferApi.model;

/**
 * Model definition for TimeZone.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the sellOfferApi. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeZone extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dstsavings;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rawOffset;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * @param displayName displayName or {@code null} for none
   */
  public TimeZone setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDstsavings() {
    return dstsavings;
  }

  /**
   * @param dstsavings dstsavings or {@code null} for none
   */
  public TimeZone setDstsavings(java.lang.Integer dstsavings) {
    this.dstsavings = dstsavings;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public TimeZone setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRawOffset() {
    return rawOffset;
  }

  /**
   * @param rawOffset rawOffset or {@code null} for none
   */
  public TimeZone setRawOffset(java.lang.Integer rawOffset) {
    this.rawOffset = rawOffset;
    return this;
  }

  @Override
  public TimeZone set(String fieldName, Object value) {
    return (TimeZone) super.set(fieldName, value);
  }

  @Override
  public TimeZone clone() {
    return (TimeZone) super.clone();
  }

}
