package org.openapitools.virtualan.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ModelList
 */

@JsonTypeName("List")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class ModelList {

  private @Nullable String _123list;

  public ModelList _123list(@Nullable String _123list) {
    this._123list = _123list;
    return this;
  }

  /**
   * Get _123list
   * @return _123list
   */
  
  @Schema(name = "123-list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("123-list")
  public @Nullable String get123list() {
    return _123list;
  }

  public void set123list(@Nullable String _123list) {
    this._123list = _123list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelList _list = (ModelList) o;
    return Objects.equals(this._123list, _list._123list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_123list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelList {\n");
    sb.append("    _123list: ").append(toIndentedString(_123list)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

