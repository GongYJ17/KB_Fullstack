<template>
  <li><input type="checkbox" v-model="checked" />옵션1</li>
</template>
<script>
export default {
  name: 'CheckboxItem',
  data() {
    return {
      props: ['name', 'checked'],
    };
  },
};
</script>
