/*
 * �� Copyright IBM Corp. 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */

package com.ibm.sbt.services.client.connections.blogs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Swati Singh
 *
 */
public class BlogGetUpdateTest extends BaseBlogServiceTest {

	@Before
	public void initBlog() {
		blog = createBlog();
	}

	@Test
	public void GetBlog() {
		try {
			Blog blogGot = blogService.getBlog(blog.getBlogUuid());

			assertEquals(blog.getTitle(), blogGot.getTitle());
			assertEquals(blog.getContent(), blogGot.getContent());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error calling blogService.getBlog() caused by: "+e.getMessage());
		}
	}

	@Test
	public void UpdateBlog() {
		try {
			blog.setTitle("New title " + System.currentTimeMillis());
			blog.setSummary("New Summary " + System.currentTimeMillis());
			blogService.updateBlog(blog);
			Blog blogReturned = blogService.getBlog(blog.getBlogUuid());
			assertEquals(unRandomize(blogReturned.getTitle()), unRandomize(blog.getTitle()));
			assertEquals(unRandomize(blogReturned.getSummary()), unRandomize(blog.getSummary()));
		} catch (Exception e) {
			fail("Error calling blogService.updateBlog() caused by: "+e.getMessage());
		}
	}

	@After
	public void deleteBlogOnExit() {
		deleteBlog(blog);
	}
}
