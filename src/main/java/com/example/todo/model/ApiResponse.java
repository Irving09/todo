/**
 * CONFIDENTIAL INFORMATION
 *
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 *
 * Date: Mar 11, 2018
 * Copyright 2018 innoirvinge@gmail.com
 */
package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {

  private T content;

//  private List<NavigableLink> links;

}
