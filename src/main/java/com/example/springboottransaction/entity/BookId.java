package com.example.springboottransaction.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookId implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private Long id;
  @Id
  private String isbn;

}
