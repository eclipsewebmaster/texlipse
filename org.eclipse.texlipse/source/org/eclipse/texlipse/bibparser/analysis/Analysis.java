/*******************************************************************************
 * Copyright (c) 2017 the TeXlipse team and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     The TeXlipse team - initial API and implementation
 *******************************************************************************/
/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.eclipse.texlipse.bibparser.analysis;

import org.eclipse.texlipse.bibparser.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseABibtex(ABibtex node);
    void caseABibstreBibEntry(ABibstreBibEntry node);
    void caseABibeBibEntry(ABibeBibEntry node);
    void caseABibtaskBibEntry(ABibtaskBibEntry node);
    void caseAStrbraceStringEntry(AStrbraceStringEntry node);
    void caseAStrparenStringEntry(AStrparenStringEntry node);
    void caseAEntrybraceEntry(AEntrybraceEntry node);
    void caseAEntryparenEntry(AEntryparenEntry node);
    void caseAEntryDef(AEntryDef node);
    void caseAKeyvalDecl(AKeyvalDecl node);
    void caseAConcat(AConcat node);
    void caseAValueBValOrSid(AValueBValOrSid node);
    void caseAValueQValOrSid(AValueQValOrSid node);
    void caseANumValOrSid(ANumValOrSid node);
    void caseAIdValOrSid(AIdValOrSid node);

    void caseTTaskcomment(TTaskcomment node);
    void caseTWhitespace(TWhitespace node);
    void caseTEstring(TEstring node);
    void caseTScribeComment(TScribeComment node);
    void caseTPreamble(TPreamble node);
    void caseTEntryName(TEntryName node);
    void caseTComment(TComment node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTBString(TBString node);
    void caseTLParen(TLParen node);
    void caseTRParen(TRParen node);
    void caseTComma(TComma node);
    void caseTEquals(TEquals node);
    void caseTSharp(TSharp node);
    void caseTNumber(TNumber node);
    void caseTIdentifier(TIdentifier node);
    void caseTQuotec(TQuotec node);
    void caseTStringLiteral(TStringLiteral node);
    void caseEOF(EOF node);
}