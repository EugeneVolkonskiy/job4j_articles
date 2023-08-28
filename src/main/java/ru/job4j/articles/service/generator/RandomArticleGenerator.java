package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.List;
import java.util.Random;

public class RandomArticleGenerator implements ArticleGenerator {

    @Override
    public Article generate(List<Word> words, Random random) {
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            content.append(words.get(random.nextInt(words.size())).getValue()).append(" ");
        }
        return new Article(content.toString());
    }
}
