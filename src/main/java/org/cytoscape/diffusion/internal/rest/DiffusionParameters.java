package org.cytoscape.diffusion.internal.rest;

import org.cytoscape.diffusion.internal.task.DiffuseSelectedTask;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Parameters for passing to DiffuseSelectedWithOptionsTask
 * 
 * @author davidotasek
 *
 */
@ApiModel(value="Diffusion Parameters", description="Parameters for Diffusion analysis")
public class DiffusionParameters {
	@ApiModelProperty(value = "Heat Column Name", example=DiffuseSelectedTask.DIFFUSION_INPUT_COL_NAME)
	public String heatColumnName;
	@ApiModelProperty(value = "Time", example="0.1")
	public Double time;
}
