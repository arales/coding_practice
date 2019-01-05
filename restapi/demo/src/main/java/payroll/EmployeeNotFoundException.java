package payroll;

public class EmployeeNotFoundException extends RuntimeException
{
  long id;

  public EmployeeNotFoundException(long id)
  {
    this.id = id;
  }

  public String getMessage()
  {
    return "Could not find employee " + this.id + "\n";
  }
}