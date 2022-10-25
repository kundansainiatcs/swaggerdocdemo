package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the schema defination for book model
 */
@Schema(description = "This is the schema defination for book model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-25T06:13:59.869Z[GMT]")


public class Book   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isbnNumber")
  private String isbnNumber = null;

  @JsonProperty("authorName")
  private String authorName = null;

  public Book id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "12345", accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Book name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "rich dad poor dad", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book isbnNumber(String isbnNumber) {
    this.isbnNumber = isbnNumber;
    return this;
  }

  /**
   * Get isbnNumber
   * @return isbnNumber
   **/
  @Schema(example = "ABC123XY", required = true, description = "")
      @NotNull

    public String getIsbnNumber() {
    return isbnNumber;
  }

  public void setIsbnNumber(String isbnNumber) {
    this.isbnNumber = isbnNumber;
  }

  public Book authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * Get authorName
   * @return authorName
   **/
  @Schema(example = "Robert", required = true, description = "")
      @NotNull

    public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.name, book.name) &&
        Objects.equals(this.isbnNumber, book.isbnNumber) &&
        Objects.equals(this.authorName, book.authorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isbnNumber, authorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isbnNumber: ").append(toIndentedString(isbnNumber)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
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
