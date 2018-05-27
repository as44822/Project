
package org.hospital.abhi;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HospitalWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{HospitalConfig.class};
	}

	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{HospitalConfig.class};
	}

	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{
				"*.hos"
		};
	}

}
