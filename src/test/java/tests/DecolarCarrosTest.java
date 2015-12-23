package tests;

public class DecolarCarrosTest {
	
		public FirefoxDriver createFirefoxDriver() throws URISyntaxException, IOException {
			
	    FirefoxProfile profile = new FirefoxProfile();
	    URL url = this.getClass().getResource("/modify_headers-0.7.1.1-fx.xpi");
	    File modifyHeaders = new File(url.toURI());

	    profile.setEnableNativeEvents(false);
	    profile.addExtension(modifyHeaders);

	    profile.setPreference("modifyheaders.headers.count", 1);
	    profile.setPreference("modifyheaders.headers.action0", "Add");
	    profile.setPreference("modifyheaders.headers.name0", SOME_HEADER);
	    profile.setPreference("modifyheaders.headers.value0", "true");
	    profile.setPreference("modifyheaders.headers.enabled0", true);
	    profile.setPreference("modifyheaders.config.active", true);
	    profile.setPreference("modifyheaders.config.alwaysOn", true);

	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setBrowserName("firefox");
	    capabilities.setPlatform(org.openqa.selenium.Platform.ANY);
	    capabilities.setCapability(FirefoxDriver.PROFILE, profile);
	    return new FirefoxDriver(capabilities);
	}

}
