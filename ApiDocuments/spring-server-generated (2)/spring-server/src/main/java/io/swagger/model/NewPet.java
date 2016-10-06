package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * NewPet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-06T19:35:44.435Z")

public class NewPet   {
  private BigDecimal id = null;

  private String name = null;

  private BigDecimal ages = null;

  private BigDecimal weights = null;

  public NewPet id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public NewPet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewPet ages(BigDecimal ages) {
    this.ages = ages;
    return this;
  }

   /**
   * Get ages
   * @return ages
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAges() {
    return ages;
  }

  public void setAges(BigDecimal ages) {
    this.ages = ages;
  }

  public NewPet weights(BigDecimal weights) {
    this.weights = weights;
    return this;
  }

   /**
   * Get weights
   * @return weights
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWeights() {
    return weights;
  }

  public void setWeights(BigDecimal weights) {
    this.weights = weights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPet newPet = (NewPet) o;
    return Objects.equals(this.id, newPet.id) &&
        Objects.equals(this.name, newPet.name) &&
        Objects.equals(this.ages, newPet.ages) &&
        Objects.equals(this.weights, newPet.weights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ages, weights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    weights: ").append(toIndentedString(weights)).append("\n");
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

