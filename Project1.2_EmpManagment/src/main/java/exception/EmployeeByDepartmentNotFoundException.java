package exception;

public class EmployeeByDepartmentNotFoundException extends Exception
{
  public EmployeeByDepartmentNotFoundException(String msg)
  {
	  super(msg);
  }
}
