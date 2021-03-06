/*
 * Copyright (c) 2008, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.grizzly;

import java.util.concurrent.Future;

/**
 * Implementations of this interface are able to read data from internal source to a {@link Buffer}.
 *
 * Grizzly {@link Connection} extends {@link Readable}.
 *
 * @author Alexey Stashok
 */
public interface Readable<L> {

    /**
     * Method reads data.
     * 
     * @param <M> type of data to read
     * @return {@link Future}, using which it's possible to check the result
     */
    <M> GrizzlyFuture<ReadResult<M, L>> read();

    <M> void read(CompletionHandler<ReadResult<M, L>> completionHandler);
}
