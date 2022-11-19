package com.company.ciyu.screen.word;

import io.jmix.ui.screen.*;
import com.company.ciyu.entity.Word;

@UiController("Word.browse")
@UiDescriptor("word-browse.xml")
@LookupComponent("wordsTable")
public class WordBrowse extends StandardLookup<Word> {
}