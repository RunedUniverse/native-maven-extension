package net.runeduniverse.tools.maven.nativext.mojos;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * help mojo for the native-maven-extension
 * 
 * @author Pl4yingNight
 * @goal help
 */
public class HelpMojo extends AbstractMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		// TODO Auto-generated method stub
		getLog().info("Help NATIVE");
	}

}
