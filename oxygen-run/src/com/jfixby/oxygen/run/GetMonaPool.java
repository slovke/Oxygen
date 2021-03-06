
package com.jfixby.oxygen.run;

import java.io.IOException;

import com.jfixby.oxygen.call.pool.StratumPoolPerformance;
import com.jfixby.oxygen.mona.call.pool.MonaAsicPoolPerformance;
import com.jfixby.oxygen.mona.call.pool.MonaHubPoolPerformance;
import com.jfixby.scarabei.api.log.L;
import com.jfixby.scarabei.api.sys.settings.ExecutionMode;
import com.jfixby.scarabei.api.sys.settings.SystemSettings;
import com.jfixby.scarabei.red.desktop.ScarabeiDesktop;

public class GetMonaPool {

	public static void main (final String[] args) throws IOException {
		ScarabeiDesktop.deploy();
		SystemSettings.setExecutionMode(ExecutionMode.DEMO);
		{
			final StratumPoolPerformance pool = new MonaAsicPoolPerformance().read();
			L.d("users", pool.users);
			L.d("pool", pool);
		}
		{
			final StratumPoolPerformance pool = new MonaHubPoolPerformance().read();
			L.d("users", pool.users);
			L.d("pool", pool);
		}
	}

}
