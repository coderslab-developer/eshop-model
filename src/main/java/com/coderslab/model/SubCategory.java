/**
 * 
 */
package com.coderslab.model;

import java.util.List;

import lombok.Data;

/**
 * @author cyclingbd007
 *
 */
@Data
public class SubCategory {

	private Integer subCategoryId;
	private Integer categoryId;
	private String subCategoryName;
	private boolean status;
	private List<Product> products;
}
