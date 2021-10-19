package mineproject.minenorthwind.core.utilities;


public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {
		super(data,true, message);
		// TODO Auto-generated constructor stub
	}
	
	public SuccessDataResult(T data) {
		super(data,true);
	}
	
	public SuccessDataResult( String message) {
		super(null,true, message);
		// TODO Auto-generated constructor stub
	}
	
	public SuccessDataResult() {
		super(null,true);
		// TODO Auto-generated constructor stub
	}

}
