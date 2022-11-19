package com.company.ciyu.screen.word;

import io.jmix.ui.screen.*;
import com.company.ciyu.entity.Word;

@UiController("Word.edit")
@UiDescriptor("word-edit.xml")
@EditedEntityContainer("wordDc")
public class WordEdit extends StandardEditor<Word> {
}