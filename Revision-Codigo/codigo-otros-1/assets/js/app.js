const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name'); /*-- se agrega un punto */
const $b = document.querySelector('.blog'); /*-- se agrega un punto y se quita el gato */
const $l = document.querySelector('.location');

 async function displayUser(username) { /* se agrega async a la función*/
  $n.textContent = 'cargando...';
  const data = await fetch(`${usersEndpoint}/${username}`); /*cambiamos response por data*/
  console.log(data);
  $n.textContent = `${data.type}`; /*cambiamos name por type*/
  $b.textContent = `${data.url}`; /*cambiamos blog por url*/
  $l.textContent = `${data.redirected}`; /*cambiamos location por redirected*/
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`
}

displayUser('stolinski').catch(handleError);