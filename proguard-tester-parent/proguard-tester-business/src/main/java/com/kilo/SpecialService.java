
package com.kilo;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("specialService")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface SpecialService {

    @GET
    @Path("someText")
    String getSomeText();

    @GET
    @Path("someInt")
    Integer getSomeInt();

    @GET
    @Path("someStrings")
    List<String> getSomeStrings();

    @GET
    @Path("someStringsWithInput/{data}")
    List<String> getSomeStringsWithInput(@PathParam("data") String data);

    @GET
    @Path("someStringsWithDateInput")
    List<String> getSomeStringsWithDateInput(@QueryParam("date") Date data);

    @GET
    @Path("someStringsWithStringInputs")
    List<String> getSomeStringsWithStringInputs(
            @QueryParam("ids") List<String> ids);

    @GET
    @Path("someIntsWithIntInputs")
    List<Integer> getSomeIntsWithIntInputs(@QueryParam("ids") List<Integer> ids);

    @GET
    @Path("someComplexObjectsWithIntInputs")
    List<SpecialObject> getSomeComplexObjectsWithIntInputs(
            @QueryParam("ids") List<Integer> ids);

    @GET
    @Path("someComplexObjectsWithMultipleInputs")
    List<SpecialObject> getSomeComplexObjectsWithMultipleInputs(
            @QueryParam("name") String name, @QueryParam("value") Integer value);

    @GET
    @Path("someComplexObjectsWithDateInput")
    List<SpecialObject> getSomeComplexObjectsWithDateInput(
            @QueryParam("ids") List<Integer> ids, @QueryParam("date") Date date);

    @GET
    @Path("someComplexObjectsWithComplexInput")
    List<SpecialObject> getSomeComplexObjectsWithComplexInput(
            @QueryParam("ids") List<Integer> ids,
            @QueryParam("date") Date date,
            @QueryParam("input") SpecialObject input);
}
