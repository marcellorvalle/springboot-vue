<template>
    <div>
        <button v-on:click="chamadaRemota()">Chamar backend</button>
        <p>A resposta foi: {{ mensagem }}</p>
    </div>
</template>

<script lang="ts">
    import {Component, Vue} from 'vue-property-decorator';
    import Axios from 'axios';

    @Component
    export default class HelloWorld extends Vue {
        private mensagem: string = '';

        public chamadaRemota() {
            Axios.get('http://localhost:8080/hello')
                .then((response) => (this.mensagem = response.data));
        }
    }
</script>
