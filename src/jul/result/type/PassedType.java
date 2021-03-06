package jul.result.type;

public class PassedType implements ResultType
{
	private static final String PASSED_TYPE = "PASSED";

	@Override
	public String getType()
	{
		return PassedType.PASSED_TYPE;
	}

	@Override
	public String getCause()
	{
		return "";
	}

	@Override
	public boolean isSuccess()
	{
		return true;
	}

	@Override
	public String toString()
	{
		return PassedType.PASSED_TYPE;
	}
}
