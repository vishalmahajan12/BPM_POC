package com.cox.util;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;

public class KieModel {

	KieBase kbase = null;
	ReleaseId releaseId = null;
	// KieScanner kScanner = null;

	public void initialize() {
		// if(kScanner!=null)
		// return;
		KieServices ks = KieServices.Factory.get();
		releaseId = ks.newReleaseId("com.cox.cobra", "cobra-rules", "LATEST");
		System.out.println("Inside Initialize");
		KieContainer kcont = ks.newKieContainer(releaseId);
		// kScanner = ks.newKieScanner( kcont );
		kbase = kcont.getKieBase();
		// kScanner.start( 10000L );
		// System.out.println("Started KieScanner sucessfully...");
	}

	public KieBase getKieBase() {
		initialize();
		// kScanner.scanNow();
		return kbase;
	}

	public void cleanUp() {
		kbase = null;
		// kScanner.shutdown();
	}

	public String getReleaseId() {
		return releaseId.getVersion();
	}
}
