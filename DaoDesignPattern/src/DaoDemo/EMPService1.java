package DaoDemo;

import java.util.List;

public interface EMPService1 
{
     int insertEmp(EmpDto e);
     List<EmpDto> getAll();
     EmpDto getEmpBYId(int id);
     int delectemp(int id);
}
