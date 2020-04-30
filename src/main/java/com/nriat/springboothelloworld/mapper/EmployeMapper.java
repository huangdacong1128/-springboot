package com.nriat.springboothelloworld.mapper;

import com.nriat.springboothelloworld.bean.Employee;
import org.apache.ibatis.annotations.*;


/**
 * @author hdc
 */
@Mapper
public interface EmployeMapper {

    /**
     * 该方法根据员工的id获取员工
     * @param id 员工的id
     * @return 员工对象
     */
    @Select("select * from employee where id = #{id} ")
    public Employee getEmpById(Integer id);

    /**
     * 更新员工的信息
     * @param emp 员工的的对象
     */
    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId}")
    public void updateEmp(Employee emp);

    /**
     * 根据id删除员工
     * @param id
     */
    @Delete("delete from employee where id=#{id}")
    public  void deleteEmpById(Integer id);

    /**
     * 插入一个员工
     * @param emp
     */
    @Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{dId})")
    public void insertOneEmp(Employee emp);


}
