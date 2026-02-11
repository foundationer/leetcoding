package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.phase5.structures.tree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LevelsAverageTest {

    private LevelsAverage levelsAverage;

    @BeforeEach
    public void setUp() {
        levelsAverage = new LevelsAverage();
    }

    @Test
    public void averageOfEmptyTree() {
        List<Double> average = levelsAverage.averageOfLevels(null);

        assertTrue(average.isEmpty());
    }

    @Test
    public void averageOfRoot() {
        List<Double> average = levelsAverage.averageOfLevels(new TreeNode(1));

        assertEquals(List.of(1.0), average);
    }

    @Test
    public void complexAverage() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        List<Double> average = levelsAverage.averageOfLevels(root);

        assertEquals(List.of(3.0, 14.5), average);
    }
}
