package io.userapp.client;

import io.userapp.client.exceptions.InvalidMethodException;
import io.userapp.client.exceptions.InvalidServiceException;
import io.userapp.client.exceptions.ServiceException;
import io.userapp.client.exceptions.TransportException;
import io.userapp.client.exceptions.UserAppException;

public interface IUserAppAPI {

	public void setOptions(UserApp.ClientOptions options);

	public UserApp.ClientOptions getOptions();

	/* Set the API method */
	public IUserAppAPI method(String name);

	/* Add an input parameter */
	public IUserAppAPI parameter(String name, Object value);

	/* Perform the API call */
	public UserApp.Result call() throws UserAppException,
			TransportException, ServiceException, InvalidServiceException,
			InvalidMethodException;

}