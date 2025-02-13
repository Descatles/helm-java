/*
 * Copyright 2024 Marc Nuri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package helm

import (
	"fmt"
	"helm.sh/helm/v3/pkg/action"
	"strings"
)

type ShowOptions struct {
	Path         string
	OutputFormat string
}

func Show(options *ShowOptions) (string, error) {
	var format action.ShowOutputFormat
	for _, showOutputFormat := range []action.ShowOutputFormat{
		action.ShowAll,
		action.ShowChart,
		action.ShowValues,
		action.ShowReadme,
		action.ShowCRDs,
	} {
		if showOutputFormat.String() == strings.ToLower(options.OutputFormat) {
			format = showOutputFormat
			break
		}
	}
	if format == "" {
		return "", fmt.Errorf("invalid output format: %s", options.OutputFormat)
	}
	client := action.NewShowWithConfig(format, NewCfg(&CfgOptions{}))
	return client.Run(options.Path)
}
