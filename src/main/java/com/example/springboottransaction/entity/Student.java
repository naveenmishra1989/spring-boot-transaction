package com.example.springboottransaction.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

@DynamicUpdate
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  @CreationTimestamp
  private LocalDateTime creationDateTime;
  @UpdateTimestamp
  private LocalDateTime updateDateTime;


}
