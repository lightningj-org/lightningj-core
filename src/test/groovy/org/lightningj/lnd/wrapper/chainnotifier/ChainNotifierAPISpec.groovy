/************************************************************************
 *                                                                       *
 *  LightningJ                                                           *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public License   *
 *  (LGPL-3.0-or-later)                                                  *
 *  License as published by the Free Software Foundation; either         *
 *  version 3 of the License, or any later version.                      *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/
package org.lightningj.lnd.wrapper.chainnotifier

import io.grpc.ManagedChannel
import org.lightningj.lnd.wrapper.autopilot.AsynchronousAutopilotAPI
import org.lightningj.lnd.wrapper.autopilot.SynchronousAutopilotAPI
import spock.lang.Specification

/**
 * Unit tests for ChainNotifier API classes.
 * <p>
 * This class just verifies that the API classes have been generated.
 * Functional tests is in the integration tests.
 * </p>
 *
 * Created by Philip Vendil.
 */
class ChainNotifierAPISpec extends Specification {

    // Initialization is tested in SynchronousAPISpec

    def asyncApi = new AsynchronousChainNotifierAPI(Mock(ManagedChannel))
    def syncApi = new SynchronousChainNotifierAPI(Mock(ManagedChannel))

    def "Verify that apis have been created."(){
        expect:
        asyncApi != null
        syncApi != null
    }
}
