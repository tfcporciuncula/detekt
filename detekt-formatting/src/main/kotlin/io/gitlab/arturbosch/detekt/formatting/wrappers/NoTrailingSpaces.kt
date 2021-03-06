package io.gitlab.arturbosch.detekt.formatting.wrappers

import com.pinterest.ktlint.ruleset.standard.NoTrailingSpacesRule
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.formatting.FormattingRule

/**
 * See <a href="https://ktlint.github.io/#rule-trailing-whitespaces">ktlint-website</a> for documentation.
 *
 * @active since v1.0.0
 * @autoCorrect since v1.0.0
 */
class NoTrailingSpaces(config: Config) : FormattingRule(config) {

    override val wrapping = NoTrailingSpacesRule()
    override val issue = issueFor("Detects trailing spaces")
}
