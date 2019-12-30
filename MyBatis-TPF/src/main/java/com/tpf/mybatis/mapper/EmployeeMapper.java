package com.tpf.mybatis.mapper;

import com.tpf.mybatis.bean.Employee;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  EmployeeMapper.java,v 1.0, 2019/12/27-12:45 tianpengfei Exp $
 */
public interface EmployeeMapper {
	public Employee getEmpById(String id);
}
