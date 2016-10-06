package com.conghau.SwaggerDemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * StatusModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-06T19:35:44.435Z")

public class StatusModel   {
  private BigDecimal status = null;

  private BigDecimal errorCode = null;

  private String messages = null;

  public StatusModel status(BigDecimal status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public StatusModel errorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
  }

  public StatusModel messages(String messages) {
    this.messages = messages;
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(value = "")
  public String getMessages() {
    return messages;
  }

  public void setMessages(String messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusModel statusModel = (StatusModel) o;
    return Objects.equals(this.status, statusModel.status) &&
        Objects.equals(this.errorCode, statusModel.errorCode) &&
        Objects.equals(this.messages, statusModel.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errorCode, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusModel {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

