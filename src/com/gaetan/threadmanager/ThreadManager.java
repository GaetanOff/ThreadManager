/*
 * ThreadManager: Boost Java App via multi-threading.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.gaetan.threadmanager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadManager {
    private final ExecutorService threadPool;
    private final ScheduledExecutorService threadScheduledPool;

    public ThreadManager() {
        this.threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        this.threadScheduledPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
    }

    public ExecutorService getThreadPool() {
        return this.threadPool;
    }

    public ScheduledExecutorService getThreadScheduledPool() {
        return this.threadScheduledPool;
    }
}
