package org.cytoscape.diffusion.internal.client;

import java.util.List;

/**
 * 
 * Response from CI standard services
 * 
 */
public class CIResponse<T> {

	public T data;
	public List<CIError> errors;
}