/*******************************************************************************
 * Copyright (c) 2003 International Business Machines Corp. and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v0.5 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v05.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/
package org.eclipse.ltk.core.refactoring.participants;

/**
 * A special processor that performs rename operations. A rename processor is
 * responsible for actually renaming the element. Additionally it may update
 * other resources of the same domain which are affected by the rename
 * operation. For example, a Java method rename processor also updates all
 * references in Java code to the method to be renamed.
 * <p>
 * The main purpose of this class is type safety for the generic rename
 * refactoring
 * </p>
 * 
 * @since 3.0
 */
public abstract class RenameProcessor extends RefactoringProcessor {
}