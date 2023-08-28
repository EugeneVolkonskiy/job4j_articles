package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.List;
import java.util.Random;

public interface ArticleGenerator {
    Article generate(List<Word> words, Random random);
}
