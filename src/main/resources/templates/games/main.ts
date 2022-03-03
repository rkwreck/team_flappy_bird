//! IF ANYTHING IN THIS FILE IS CHANGED MAKE SURE setVersion.js HAS ALSO BEEN UPDATED
import App from "../../../../../../../Downloads/wordle-main/src/App.svelte";

export default new App({
	target: document.body,
	props: {
		version: "1.2.3",
	}
});
