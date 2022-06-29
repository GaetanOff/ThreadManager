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

package com.gaetan.threadmanager.example;

import com.gaetan.threadmanager.ThreadManager;

import java.util.concurrent.TimeUnit;

public class App {
    private ThreadManager threadManager; //Reference to the threadManager

    public App() {
        this.threadManager = new ThreadManager();
    }

    /**
     * Here is an example to use the thread pool.
     */
    public void example() {
        this.threadManager.getThreadPool().execute(() -> {
            System.out.println("This will be executed outside the main thread.");
        });
    }

    /**
     * Here is an example to use the Scheduled thread pool.
     */
    public void repeatedTask() {
        this.threadManager.getThreadScheduledPool().scheduleAtFixedRate(() -> {
            System.out.println("This will be sent every hour.");
        }, 0, 1, TimeUnit.HOURS);
    }
}
