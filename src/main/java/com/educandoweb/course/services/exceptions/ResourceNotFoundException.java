package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	/**classe para tratar um excessão personalizada
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id" + id);
	}
	
}
