package fr.gfi.miditech.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * service REST WhoAmI
 */
@RestController
@RequestMapping("who")
public class WhoAmIResource {

	/**
	 * find all
	 *
	 * @return all persons
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String findAll() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (final UnknownHostException e) {
			return e.getMessage();
		}
	}
}
