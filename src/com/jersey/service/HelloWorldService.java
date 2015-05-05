/**
 * @author liwang
 * @date 2015年3月20日 上午9:53:12 
 */
package com.jersey.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jvc.util.DateUtils;

import com.jersey.entity.Student;

/**
 * @Description: HelloWorldService
 * @author liwang
 * @date 2015年3月20日 上午9:53:12
 * 
 */
@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("{id}/test/{sname}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getHello(@PathParam("id") int id,
			@PathParam("sname") String sname) {

		Student student = new Student();
		student.setId(id);
		student.setSname(sname);
		student.setDate(DateUtils.now());
		
		return student;
	}

}
