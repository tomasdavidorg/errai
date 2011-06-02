package org.jboss.errai.ioc.rebind.ioc.codegen.builder;

import org.jboss.errai.ioc.rebind.ioc.codegen.Statement;

/**
 * @author Mike Brock <cbrock@redhat.com>
 * @author Christian Sadilek <csadilek@redhat.com>
 */
public interface ContextualStatementBuilder extends LoopBuilder, IfBlockBuilder {
    ContextualStatementBuilder invoke(String methodName, Object... parameters);

    Statement returnValue();
}
