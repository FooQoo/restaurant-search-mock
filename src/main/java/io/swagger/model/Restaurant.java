package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Restaurants
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T14:40:17.714141527Z[GMT]")


public class Restaurant {
  private String name = null;

  private String address = null;

  private String genre = null;

  private Float rating = null;

  public Restaurant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Restaurant name
   * @return name
   **/
  @Schema(description = "Restaurant name")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Restaurant address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Restaurant address
   * @return address
   **/
  @Schema(description = "Restaurant address")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Restaurant genre(String genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Restaurant genre
   * @return genre
   **/
  @Schema(description = "Restaurant genre")
  
    public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public Restaurant rating(Float rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Restaurant rating (0.0-5.0)
   * minimum: 0
   * maximum: 5
   * @return rating
   **/
  @Schema(description = "Restaurant rating (0.0-5.0)")
  
  @DecimalMin("0") @DecimalMax("5")   public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restaurant Restaurant = (Restaurant) o;
    return Objects.equals(this.name, Restaurant.name) &&
        Objects.equals(this.address, Restaurant.address) &&
        Objects.equals(this.genre, Restaurant.genre) &&
        Objects.equals(this.rating, Restaurant.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, genre, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restaurants {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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
